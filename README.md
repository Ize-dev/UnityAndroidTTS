# UnityAndroidTTS
Basic implementation of text to speech for Unity on Android.

1. Add the AndroidTTS script to any gameobject
2. On the same gameobject add a reference in any of your classes with: private AndroidTTS tts;
3. In your Start() get the tts-component: tts = GetComponent<AndroidTTS>();
4. ???
5. Call tts.Speak("Your text here");

Done.

You can also use tts.SetPitch(), tts.SetSpeechRate() and tts.Stop()

It will use the configured tts-provider on your android device so there is no need to set a locale via script.

Should be pretty self explanatory.

Tested with Unity 6000.0.*

Enjoy.
