package com.boya.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RoverCoordinator {
    /**
     * 所有已注册小车的数据结构
     */
    private Map<Integer,Rover> roverMap;

    private int maxX;
    private int maxY;

    public  RoverCoordinator(){
        roverMap = new HashMap<>();
    }

    public void addRover(Rover rover) {
        roverMap.put(rover.getId(), rover);
        checkOutOfRange();
    }

    /**
     *操控指定的小车完成指令序列，同时检查越界问题
     * @param id 小车id
     * @param commandSequence 指令列
     */

    public void action(int id, String commandSequence) {
           char[] cS = commandSequence.toCharArray();
           Rover rover=roverMap.get(id);
        for (char c : cS) {
            rover.action(c);
        }
    }

    /**
     * 判断小车是否越界，越界则抛出RuntimeException
     * 说明情况并终止程序
     */
    private  void checkOutOfRange(){
        for (Map.Entry<Integer, Rover> rover:roverMap.entrySet()
             ) {
            if(rover.getValue().getX()>this.maxX||rover.getValue().getY()>this.maxY){
                throw new RuntimeException("有小车出界了！");   }
        }





    }


    public Map<Integer, Rover> getRoverMap() {
        return roverMap;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setRoverMap(Map<Integer, Rover> roverMap) {
        this.roverMap = roverMap;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}