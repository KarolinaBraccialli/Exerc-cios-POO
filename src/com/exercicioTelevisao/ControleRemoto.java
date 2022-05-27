package com.exercicioTelevisao;

public class ControleRemoto {

    void aumentarVolume(Televisao televisao){
        televisao.setVolume(televisao.getVolume()+1);
    }
    void diminurVolume(Televisao televisao){
        televisao.setVolume(televisao.getVolume()-1);
    }
    void aumentarCanal(Televisao televisao){
        televisao.setCanal(televisao.getCanal()+1);
    }
    void diminuirCanal(Televisao televisao){
        televisao.setCanal(televisao.getCanal()-1);
    }
    void trocarCanal(Televisao televisao, int canal){
        televisao.setCanal(canal);
    }
    int volume(Televisao televisao){
        return televisao.getVolume();
    }
    int canal(Televisao televisao){
        return televisao.getCanal();
    }

}
