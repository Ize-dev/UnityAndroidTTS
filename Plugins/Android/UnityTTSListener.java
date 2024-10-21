package com.unity3d.player;

import android.speech.tts.TextToSpeech;

public class UnityTTSListener implements TextToSpeech.OnInitListener {
    private String unityGameObjectName;

    public UnityTTSListener(String gameObjectName) {
        unityGameObjectName = gameObjectName;
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            UnityPlayer.UnitySendMessage(unityGameObjectName, "OnTTSInitialized", "SUCCESS");
        } else {
            String errorMessage = "FAILED: ";
            switch (status) {
                case TextToSpeech.ERROR:
                    errorMessage += "ERROR";
                    break;
                case TextToSpeech.ERROR_NETWORK:
                    errorMessage += "ERROR_NETWORK";
                    break;
                case TextToSpeech.ERROR_NETWORK_TIMEOUT:
                    errorMessage += "ERROR_NETWORK_TIMEOUT";
                    break;
                case TextToSpeech.ERROR_NOT_INSTALLED_YET:
                    errorMessage += "ERROR_NOT_INSTALLED_YET";
                    break;
                case TextToSpeech.ERROR_OUTPUT:
                    errorMessage += "ERROR_OUTPUT";
                    break;
                case TextToSpeech.ERROR_SERVICE:
                    errorMessage += "ERROR_SERVICE";
                    break;
                case TextToSpeech.ERROR_SYNTHESIS:
                    errorMessage += "ERROR_SYNTHESIS";
                    break;
                default:
                    errorMessage += "UNKNOWN_ERROR";
            }
            UnityPlayer.UnitySendMessage(unityGameObjectName, "OnTTSInitialized", errorMessage);
        }
    }
}