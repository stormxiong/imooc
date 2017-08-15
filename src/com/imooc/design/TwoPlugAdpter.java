package com.imooc.design;

/**
 * Created by xiongpc on 2017/8/15.
 */
public class TwoPlugAdpter implements IThreePlug {

    private GBTwoPlug twoPlug;

    public TwoPlugAdpter(GBTwoPlug twoPlug) {
        this.twoPlug = twoPlug;
    }

    @Override
    public void powerWithThree() {
        twoPlug.powerWithTwo();
    }
}
