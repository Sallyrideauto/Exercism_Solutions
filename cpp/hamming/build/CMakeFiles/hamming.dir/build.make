# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.29

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/local/Cellar/cmake/3.29.1/bin/cmake

# The command to remove a file.
RM = /usr/local/Cellar/cmake/3.29.1/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/sallyride/Exercism/cpp/hamming

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/sallyride/Exercism/cpp/hamming/build

# Include any dependencies generated for this target.
include CMakeFiles/hamming.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/hamming.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/hamming.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/hamming.dir/flags.make

CMakeFiles/hamming.dir/hamming_test.cpp.o: CMakeFiles/hamming.dir/flags.make
CMakeFiles/hamming.dir/hamming_test.cpp.o: /Users/sallyride/Exercism/cpp/hamming/hamming_test.cpp
CMakeFiles/hamming.dir/hamming_test.cpp.o: CMakeFiles/hamming.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=/Users/sallyride/Exercism/cpp/hamming/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/hamming.dir/hamming_test.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/hamming.dir/hamming_test.cpp.o -MF CMakeFiles/hamming.dir/hamming_test.cpp.o.d -o CMakeFiles/hamming.dir/hamming_test.cpp.o -c /Users/sallyride/Exercism/cpp/hamming/hamming_test.cpp

CMakeFiles/hamming.dir/hamming_test.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/hamming.dir/hamming_test.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/sallyride/Exercism/cpp/hamming/hamming_test.cpp > CMakeFiles/hamming.dir/hamming_test.cpp.i

CMakeFiles/hamming.dir/hamming_test.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/hamming.dir/hamming_test.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/sallyride/Exercism/cpp/hamming/hamming_test.cpp -o CMakeFiles/hamming.dir/hamming_test.cpp.s

CMakeFiles/hamming.dir/hamming.cpp.o: CMakeFiles/hamming.dir/flags.make
CMakeFiles/hamming.dir/hamming.cpp.o: /Users/sallyride/Exercism/cpp/hamming/hamming.cpp
CMakeFiles/hamming.dir/hamming.cpp.o: CMakeFiles/hamming.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=/Users/sallyride/Exercism/cpp/hamming/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/hamming.dir/hamming.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/hamming.dir/hamming.cpp.o -MF CMakeFiles/hamming.dir/hamming.cpp.o.d -o CMakeFiles/hamming.dir/hamming.cpp.o -c /Users/sallyride/Exercism/cpp/hamming/hamming.cpp

CMakeFiles/hamming.dir/hamming.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/hamming.dir/hamming.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/sallyride/Exercism/cpp/hamming/hamming.cpp > CMakeFiles/hamming.dir/hamming.cpp.i

CMakeFiles/hamming.dir/hamming.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/hamming.dir/hamming.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/sallyride/Exercism/cpp/hamming/hamming.cpp -o CMakeFiles/hamming.dir/hamming.cpp.s

CMakeFiles/hamming.dir/test/tests-main.cpp.o: CMakeFiles/hamming.dir/flags.make
CMakeFiles/hamming.dir/test/tests-main.cpp.o: /Users/sallyride/Exercism/cpp/hamming/test/tests-main.cpp
CMakeFiles/hamming.dir/test/tests-main.cpp.o: CMakeFiles/hamming.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=/Users/sallyride/Exercism/cpp/hamming/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object CMakeFiles/hamming.dir/test/tests-main.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/hamming.dir/test/tests-main.cpp.o -MF CMakeFiles/hamming.dir/test/tests-main.cpp.o.d -o CMakeFiles/hamming.dir/test/tests-main.cpp.o -c /Users/sallyride/Exercism/cpp/hamming/test/tests-main.cpp

CMakeFiles/hamming.dir/test/tests-main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/hamming.dir/test/tests-main.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/sallyride/Exercism/cpp/hamming/test/tests-main.cpp > CMakeFiles/hamming.dir/test/tests-main.cpp.i

CMakeFiles/hamming.dir/test/tests-main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/hamming.dir/test/tests-main.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/sallyride/Exercism/cpp/hamming/test/tests-main.cpp -o CMakeFiles/hamming.dir/test/tests-main.cpp.s

# Object files for target hamming
hamming_OBJECTS = \
"CMakeFiles/hamming.dir/hamming_test.cpp.o" \
"CMakeFiles/hamming.dir/hamming.cpp.o" \
"CMakeFiles/hamming.dir/test/tests-main.cpp.o"

# External object files for target hamming
hamming_EXTERNAL_OBJECTS =

hamming: CMakeFiles/hamming.dir/hamming_test.cpp.o
hamming: CMakeFiles/hamming.dir/hamming.cpp.o
hamming: CMakeFiles/hamming.dir/test/tests-main.cpp.o
hamming: CMakeFiles/hamming.dir/build.make
hamming: CMakeFiles/hamming.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --bold --progress-dir=/Users/sallyride/Exercism/cpp/hamming/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Linking CXX executable hamming"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/hamming.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/hamming.dir/build: hamming
.PHONY : CMakeFiles/hamming.dir/build

CMakeFiles/hamming.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/hamming.dir/cmake_clean.cmake
.PHONY : CMakeFiles/hamming.dir/clean

CMakeFiles/hamming.dir/depend:
	cd /Users/sallyride/Exercism/cpp/hamming/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sallyride/Exercism/cpp/hamming /Users/sallyride/Exercism/cpp/hamming /Users/sallyride/Exercism/cpp/hamming/build /Users/sallyride/Exercism/cpp/hamming/build /Users/sallyride/Exercism/cpp/hamming/build/CMakeFiles/hamming.dir/DependInfo.cmake "--color=$(COLOR)"
.PHONY : CMakeFiles/hamming.dir/depend

