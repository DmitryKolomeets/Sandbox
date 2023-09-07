package Pets;

import java.util.ArrayList;
import java.util.List;

public class Expression {

    public static void main(String[] args) {

        /*------------------------------------------------------------------
         * PARSER RULES
         *------------------------------------------------------------------*/

//    expr : plusminus* EOF ;
//
//    plusminus: multdiv ( ( '+' | '-' ) multdiv )* ;
//
//    multdiv : factor ( ( '*' | '/' ) factor )* ;
//
//    factor : NUMBER | '(' expr ')' ;






//        22 + 3 - 2 * ( 2 * 5 + 2) * 4
        String expressionText = "2 + 2 * 2";
        List<Lexeme> lexemes = lexAnalyze(expressionText);
        LexemBuffer lexemBuffer = new LexemBuffer(lexemes);
        System.out.println(expr(lexemBuffer));
    }

    public enum LexemType {
        LEFT_BRACKET, RIGHT_BRACKET,
        OP_PLUS, OP_MINUS, OP_MUL, OP_DIV,
        NUMBER,
        EOF;
    }


    public static class Lexeme {
        LexemType type;
        String value;

        public Lexeme(LexemType type, String value) {
            this.type = type;
            this.value = value;
        }

        public Lexeme(LexemType type, Character value) {
            this.type = type;
            this.value = value.toString();
        }

        @Override
        public String toString() {
            return "Lexeme{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class LexemBuffer {
        private int pos;
        public List<Lexeme> lexemes;

        public LexemBuffer(List<Lexeme> lexemes) {
            this.lexemes = lexemes;
        }

        public Lexeme next() {
            return lexemes.get(pos++);
        }

        public void back() {
            pos--;
        }

        public int getPos() {
            return pos;
        }


    }

    public static List<Lexeme> lexAnalyze(String expText) {
        ArrayList<Lexeme> lexems = new ArrayList<>();
        int pos = 0;
        while (pos < expText.length()) {
            char c = expText.charAt(pos);
            switch (c) {
                case '(':
                    lexems.add(new Lexeme(LexemType.LEFT_BRACKET, c));
                    pos++;
                    continue;
                case ')':
                    lexems.add(new Lexeme(LexemType.RIGHT_BRACKET, c));
                    pos++;
                    continue;
                case '+':
                    lexems.add(new Lexeme(LexemType.OP_PLUS, c));
                    pos++;
                    continue;
                case '-':
                    lexems.add(new Lexeme(LexemType.OP_MINUS, c));
                    pos++;
                    continue;
                case '*':
                    lexems.add(new Lexeme(LexemType.OP_MUL, c));
                    pos++;
                    continue;
                case '/':
                    lexems.add(new Lexeme(LexemType.OP_DIV, c));
                    pos++;
                    continue;
                default:
                    if (c <= '9' && c >= '0') {
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            pos++;
                            if (pos >= expText.length()) {
                                break;
                            }
                            c = expText.charAt(pos);
                        } while (c <= '9' && c >= '0');
                        lexems.add(new Lexeme(LexemType.NUMBER, sb.toString()));
                    } else {
                        if (c != ' ') {
                            throw new RuntimeException("Unexpected character: " + c);
                        }
                        pos++;
                    }
            }
        }

        lexems.add(new Lexeme(LexemType.EOF, ""));
        return lexems;
    }


    public static int expr(LexemBuffer lexemes) {
        Lexeme lexeme = lexemes.next();
        if (lexeme.type == LexemType.EOF) {
            return 0;
        } else {
            lexemes.back();
            return plusminus(lexemes);
        }
    }

    public static int plusminus(LexemBuffer lexemes) {
        int value = multdiv(lexemes);
        while (true) {
            Lexeme lexeme = lexemes.next();
            switch (lexeme.type) {
                case OP_PLUS:
                    value += multdiv(lexemes);
                    break;
                case OP_MINUS:
                    value -= multdiv(lexemes);
                    break;
                default:
                    lexemes.back();
                    return value;
            }
        }
    }

    public static int multdiv(LexemBuffer lexemes) {
        int value = factor(lexemes);
        while (true) {
            Lexeme lexeme = lexemes.next();
            switch (lexeme.type) {
                case OP_MUL:
                    value *= factor(lexemes);
                    break;
                case OP_DIV:
                    value /= factor(lexemes);
                    break;
                default:
                    lexemes.back();
                    return value;
            }
        }
    }

    public static int factor(LexemBuffer lexemes) {
        Lexeme lexeme = lexemes.next();
        switch (lexeme.type) {
            case NUMBER:
                return Integer.parseInt(lexeme.value);
            case LEFT_BRACKET:
                int value = expr(lexemes);
                lexeme = lexemes.next(); //---------------------------------------------------<<--<<
                if (lexeme.type != LexemType.RIGHT_BRACKET) {
                    throw new RuntimeException("Unexpected token: " + lexeme.value + " at position: " + lexemes.getPos());
                }
                return value;

            default:
                throw new RuntimeException("Unexpected token: " + lexeme.value + " at position: " + lexemes.getPos());


        }
    }

}
