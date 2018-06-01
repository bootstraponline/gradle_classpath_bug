rootProject.name = "kotlin_poc"

include("xctest_parser")
project(":xctest_parser").projectDir = File(rootProject.projectDir, "../xctest_parser")
