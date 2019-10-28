package com.mfc.design.享元模式.实例;

import lombok.Data;

/**
 * @author MouFangCai
 * @date 2019/10/25 14:33
 * @description 棋子的外部属性：坐标类
 */
@Data
public class Coord_Extrinsic {

    private int x;
    private int y;

    public Coord_Extrinsic(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
