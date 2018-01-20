package me.thirdeyes.djcosmix.utils.parser;

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
public enum Difficulty {

    NOVICE(0), AMATEUR(1), PROFESSIONAL(2), NOVA(3), SUPERNOVA(4), ULTRANOVA(5), TUTORIAL(32);

    private final int id;

    Difficulty(int id){
        this.id = id;
    }

    private int getId(){
        return id;
    }

    public static Difficulty getDifficulty(int key){
        for(Difficulty difficulty : values()){
            if(difficulty.getId() == key){
                return difficulty;
            }
        }
        return null;
    }

}
