java
====

```
$ java --version
java 14.0.2 2020-07-14
Java(TM) SE Runtime Environment (build 14.0.2+12-46)
Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)```

```
$ bazel run hello
```

```
$ bazel build leetcode:all

$ bazel test leetcode:all
$ bazel test leetcode:<lc>_test
```