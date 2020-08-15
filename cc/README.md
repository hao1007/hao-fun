cc
==

```
$ clang++ --version
Apple clang version 11.0.3 (clang-1103.0.32.62)
Target: x86_64-apple-darwin19.6.0
Thread model: posix
InstalledDir: /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin

$ bazel version
Build label: 3.4.1
Build target: bazel-out/darwin-opt/bin/src/main/java/com/google/devtools/build/lib/bazel/BazelServer_deploy.jar
Build time: Tue Jul 14 06:32:14 2020 (1594708334)
Build timestamp: 1594708334
Build timestamp as int: 1594708334
```

```
$ bazel run hello
```

```
$ bazel build leetcode:all

$ bazel run leetcode:<lc>
```