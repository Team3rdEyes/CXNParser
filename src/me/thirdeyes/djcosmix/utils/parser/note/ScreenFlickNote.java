package me.thirdeyes.djcosmix.utils.parser.note;

/* 
    Copyright 2018 Team 3E²Ys

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
public class ScreenFlickNote extends Note {

    /**
     * フリックする方向
     * (-1 = 未定義)
     * (0 = 左)
     * (1 = 右)
     */
    private int direction;

    private int travelToPos;

    public ScreenFlickNote(int direction, int travelToPos){
        this.direction = direction;
        this.travelToPos = travelToPos;
    }

    public int getDirection() {
        if(!(direction == 0 || direction == 1)){
            return -1;
        }
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getTravelToPos() {
        return travelToPos;
    }

    public void setTravelToPos(int travelToPos) {
        this.travelToPos = travelToPos;
    }

}
