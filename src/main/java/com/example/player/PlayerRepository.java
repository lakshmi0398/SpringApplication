// Write your code here
package com.example.player;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository {
    ArrayList<Player> PlayersData();

    Player createPlayer(Player player);

    Player updatePlayer(int playerId, Player player);

    Player getPlayer(int playerId);

    void deletePlayer(int playerId);

}
