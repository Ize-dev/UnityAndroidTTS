# UnityAndroidTTS
Basic Implementation of Text-to-Speech for Unity on Android

1. Add the AndroidTTS script to any GameObject.
2. In any of your classes on that gameobject, create a reference to it: private AndroidTTS tts;
3. In your Start() method, get the AndroidTTS component: tts = GetComponent<AndroidTTS>();
4. Call tts.Speak("Your text here"); to make it speak.

That's it!

You can also use additional methods such as tts.SetPitch(), tts.SetSpeechRate(), and tts.Stop().

The script will use the text-to-speech provider configured on your Android device, so there’s no need to set a locale via code.

This implementation should be straightforward.

Tested with Unity 6000.0.*

Enjoy!
