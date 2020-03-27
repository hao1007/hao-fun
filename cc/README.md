cc
==

```
$ clang++ --version
Apple clang version 11.0.3 (clang-1103.0.32.29)
Target: x86_64-apple-darwin19.4.0
Thread model: posix
InstalledDir: /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin

$ bazel version
Build label: 2.2.0
Build target: bazel-out/darwin-opt/bin/src/main/java/com/google/devtools/build/lib/bazel/BazelServer_deploy.jar
Build time: Tue Mar 3 09:28:15 2020 (1583227695)
Build timestamp: 1583227695
Build timestamp as int: 1583227695
```

```
$ bazel run hello
```

```
$ bazel build leetcode:all

$ bazel run leetcode:<lc>
```