// Write your code here.
package com.example.player;

class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public void setId(int id) {
        playerId = id;
    }

    public int getId() {
        return playerId;
    }

    public void setplayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getplayerName() {
        return playerName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setjerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getjerseyNumber() {
        return jerseyNumber;
    }

}
