//package minecraft;
//
//public class Minecraft {
//
//    if(this.isMarked){
//        if(!this.isHidden && this.state!=-1){
//            ///Если эта клетка не скрыта, и на ней
//            ///ошибочно стоит флажок...
//            return Sprite.BROKEN_FLAG;
//        }
//        ///В другом случае --
//        return Sprite.FLAG;
//    }else if(this.isHidden){
//        ///Если клетка не помечена, притом скрыта...
//        return Sprite.HIDEN;
//    }else{
//        ///Если не помечена и не скрыта, выводим как есть:
//        switch (state){
//            case -2:
//                return Sprite.EXPLOSION;
//            case -1:
//                return Sprite.BOMB;
//            default:
//                assert (state>=0 && state<=8): "Some crap :c";
//                ///Сделал массив для удобства. Можете, конечно,
//                ///Писать 9 кейсов -- ваш выбор ;)
//                return  skin_by_number[state];
//        }
//    }
//}
