package(default_visibility = ["//visibility:public"])

java_binary(
    name = "webapp",
    main_class = "friends.Application",
    srcs = ["Application.java"],
    deps = [
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
    ],
    runtime_deps = [
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        ":friends",
    ],
)

java_library(
    name = "friends",
    srcs = ["FriendsController.java"],
    deps = [
        "//src/model:friend_java_proto",
        "@maven//:com_googlecode_protobuf_java_format_protobuf_java_format",
        "@maven//:org_springframework_spring_core",
        "@maven//:org_springframework_spring_web",
    ]
)
