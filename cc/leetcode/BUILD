load("@rules_cc//cc:defs.bzl", "cc_binary")

[
    cc_binary(
        name = cc[:-3],
        srcs = [
            cc,
            cc[:-3] + ".h",
        ],
    )
    for cc in glob(["*.cc"])
]
