adb root
var=$(adb shell ps | grep com.nd.android.pandareader | awk '{print $2}')
adb shell kill -9 $var