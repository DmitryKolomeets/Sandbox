//package tetris;
//
//public class Tetris {
//    if(shiftDirection != ShiftDirection.AWAITING){ // Если есть запрос на сдвиг фигуры
//
//        /* Пробуем сдвинуть */
//        gameField.tryShiftFigure(shiftDirection);
//
//        /* Ожидаем нового запроса */
//        shiftDirection = ShiftDirection.AWAITING;
//    }
//
//    if(isRotateRequested){ // Если есть запрос на поворот фигуры
//
//        /* Пробуем повернуть */
//        gameField.tryRotateFigure();
//
//        /* Ожидаем нового запроса */
//        isRotateRequested = false;
//    }
//
//    /* Падение фигуры вниз происходит если loopNumber % FRAMES_PER_MOVE == 0
//     * Т.е. 1 раз за FRAMES_PER_MOVE итераций.
//     */
//    if( (loopNumber % (FRAMES_PER_MOVE / (isBoostRequested ? BOOST_MULTIPLIER : 1)) ) == 0) gameField.letFallDown();
//
//    /* Увеличение номера итерации (по модулю FPM)*/
//    loopNumber = (loopNumber+1)% (FRAMES_PER_MOVE
//}
