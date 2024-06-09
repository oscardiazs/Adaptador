package edu.unisabana.dyas.patterns.utils;

// Clase que implementa una interfaz diferente
public class AdvancedAudioPlayerAdapter implements AudioPlayer {

    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("El archivo no es soportado");
        }
    }
    public void stop() {
        advancedAudioPlayer.stop();;
    }


}