## Problem Description

<<REPLACE THIS WITH DESCRIPTION>>

## Dev environment setup

```
Java JDK 11
```

#### Installing Java

To install Java JDK 11 using Homebrew, please use the following commands:
```
brew tap caskroom/versions
brew cask install java
```

To install Java JDK 11 from the source, please go to the following link and
unpack the respective build corresponding to your machine:
[Java JDK 11](https://jdk.java.net/11/)

To unpack the file, ensure that you have a shell running and cd to the same
directory as the downloaded file. To unpack the .tar.gz file in terminal,
use the following command:

```gunzip -c openjdk-11.0.2_osx-x64_bin.tar.gz | tar xopf -```

Make sure that the above command uses the correct version of the tar file.

## Test instructions

Run following command to run the test
```
./gradlew clean test
```

Check the test coverage using following command
```
./gradlew check
```
