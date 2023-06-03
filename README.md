SbackBar - A Beautiful Snackbar Library for Android Kotlin
========================

## Introduction
This library is build on top of Snackbar 

Type of Snackbars
-----

https://user-images.githubusercontent.com/74999138/236821504-bf0dc6b0-66e0-4760-b9a6-7b6f8179fa83.mp4



Usage
-----

This library allows you to use :
```kotlin
//Success Snackbar
SnackBar.success(findViewById(android.R.id.content), "Successfully SnackBar :)", SnackBar.LENGTH_LONG).show()

//Info Snackbar
SnackBar.info(findViewById(android.R.id.content), "Info SnackBar :)", SnackBar.LENGTH_LONG).show()

//Warning Snackbar
SnackBar.warning(findViewById(android.R.id.content), "Warning SnackBar :)", SnackBar.LENGTH_LONG).show()

//Error Snackbar
SnackBar.error(findViewById(android.R.id.content), "Error SnackBar :)", SnackBar.LENGTH_LONG).show()
```

## Setup

Currently available via [JitPack][1].

To use it, add the jitpack maven repository to your `build.gradle` file:
```gradle
repositories {
  ...
  maven { url 'https://jitpack.io' }
  ...
}
```
and add the dependency:
```gradle
dependencies {
  ...
  implementation 'com.github.gaddarkumar7447:CustomSnackBar:1.0.0'
  ...
}
```

## License

    Copyright 2023

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    - http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[1]: https://jitpack.io
