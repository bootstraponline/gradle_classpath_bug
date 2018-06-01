# gradle_classpath_bug

```
$ cd cloud_testing/kotlin_poc
$ ./gradlew build

FAILURE: Build failed with an exception.

* Where:
Build file '/gradle_classpath_bug/cloud_testing/xctest_parser/build.gradle.kts' line: 19

* What went wrong:
Error resolving plugin [id: 'org.jetbrains.kotlin.jvm', version: '1.2.41']
> Plugin request for plugin already on the classpath must not include a version
```
