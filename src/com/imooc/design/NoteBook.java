package com.imooc.design;

/**
 * Created by xiongpc on 2017/8/15.
 */
public class NoteBook {

    private IThreePlug iThreePlug;

    public NoteBook(IThreePlug iThreePlug) {
        this.iThreePlug = iThreePlug;
    }

    public void charge(){
        iThreePlug.powerWithThree();
    }

    public static void main(String[] args) {

        GBTwoPlug twoPlug = new GBTwoPlug();
        IThreePlug three = new TwoPlugAdpter(twoPlug);
        NoteBook book = new NoteBook(three);
        book.charge();
    }
}
