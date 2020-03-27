load("@rules_java//java:defs.bzl", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

package_group(
    name = "leetcode",
    packages = ["//..."],
)

[
    java_library(
        name = j,
        srcs = [j + "/Solution.java"],
    )
    for j in glob(
        ["lc*"],
        exclude_directories = 0,
    )
]

[
    java_test(
        name = j + "_test",
        srcs = [j + "/LcTest.java"],
        args = [
            "-p",
            j,
        ],
        main_class = "org.junit.platform.console.ConsoleLauncher",
        use_testrunner = False,
        runtime_deps = [
            "@maven//:org_junit_jupiter_junit_jupiter_engine",
            "@maven//:org_junit_platform_junit_platform_console",
        ],
        deps = [
            ":" + j,
            "@maven//:org_junit_jupiter_junit_jupiter_api",
        ],
    )
    for j in glob(
        ["lc*"],
        exclude_directories = 0,
    )
]
