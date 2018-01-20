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
public abstract class Note implements Cloneable {

    // ノートの小節
    private double measure;

    // 時間（ミリ秒）
    private long timestamp;

    // ノートの状態
    private int state;

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public float getTime(){
        return (float) (timestamp / 1000);
    }

    public long getMicroTime() {
        return timestamp;
    }

    public void setTime(long time) {
        this.timestamp = time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
