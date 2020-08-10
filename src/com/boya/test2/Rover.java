package com.boya.test2;

public class Rover {
    private int id;
    private int x;
    private int y;
    private String direction;

    public Rover(int id,int x,int y,String direction){
        this.direction=direction;
        this.x=x;
        this.y=y;
        this.id=id;
    }

    /**
     * 小车执行单个指令
     * @param command 指令
     */
    public void action(char command){
        char[] dir= {'N','W','S','E'};
    switch (command) {
        case 'L':

            for (int i=0;i<dir.length;i++){
                if(this.direction.equals(String.valueOf(dir[i]))){
                    if(i==dir.length-1){
                        //当方向为E时指向0完成转向
                        this.direction=String.valueOf(dir[0]);
                        break;
                    }
                    else{
                        //当方向为NWS时直接加1完成转向
                        this.direction=String.valueOf(dir[i+1]);
                        break;
                    }
                }
            }
            break;
        case 'R':
            for (int i=dir.length-1;i>-1;i--){
                if(this.direction.equals(String.valueOf(dir[i]))){
                    if(i==0){
                        //当方向为N时指向3完成转向
                        this.direction=String.valueOf(dir[3]);
                        break;
                    }
                    else{
                        //当方向为NWS时直接减1完成转向
                        this.direction=String.valueOf(dir[i-1]);
                        break;
                    }
                }
            }
            break;
        case 'M':
            switch (this.direction){
                case "N":
                    this.y++;
                    break;
                case "W":
                    this.x--;
                    break;
                case "S":
                    this.y--;
                    break;
                case "E":
                    this.x++;
                    break;
            }
            break;
        default:
            System.out.println("错误指令，已跳过，继续执行下一步");
            break;
    }
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", direction='" + direction + '\'' +
                '}';
    }
}
