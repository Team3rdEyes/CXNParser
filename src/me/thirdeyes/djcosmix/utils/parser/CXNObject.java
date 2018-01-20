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
public class CXNObject {

    // 曲情報
    private String songTitle;
    private String songComposer;
    private String songGenre;

    // グラフィックス
    private String pathToJacket;

    // MAPの情報
    private double mapBaseBPM;
    private Difficulty mapDifficulty;
    private String mapLevel;

    // プリビュー
    private int previewOffset;

    public CXNObject(){

    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String title) {
        this.songTitle = title;
    }

    public String getSongComposer() {
        return songComposer;
    }

    public void setSongComposer(String composer) {
        this.songComposer = composer;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String genre) {
        this.songGenre = genre;
    }

    public String getPathToJacket() {
        return pathToJacket;
    }

    public void setPathToJacket(String path) {
        this.pathToJacket = path;
    }

    public double getBaseBPM() {
        return mapBaseBPM;
    }

    public void setBaseBPM(double bpm) {
        this.mapBaseBPM = bpm;
    }

    public Difficulty getDifficulty() {
        return mapDifficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.mapDifficulty = difficulty;
    }

    public String getPlayLevel() {
        return mapLevel;
    }

    public void setPlayLevel(String level) {
        this.mapLevel = level;
    }

    public int getPreviewOffset() {
        return previewOffset;
    }

    public void setPreviewOffset(int previewOffset) {
        this.previewOffset = previewOffset;
    }

    public String getFormattedSongTitle(){
        return songComposer + " - " + songTitle;
    }

}
