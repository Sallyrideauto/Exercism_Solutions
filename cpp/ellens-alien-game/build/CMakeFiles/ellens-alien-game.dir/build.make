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
CMAKE_SOURCE_DIR = /Users/sallyride/Exercism/cpp/ellens-alien-game

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/sallyride/Exercism/cpp/ellens-alien-game/build

# Include any dependencies generated for this target.
include CMakeFiles/ellens-alien-game.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/ellens-alien-game.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/ellens-alien-game.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/ellens-alien-game.dir/flags.make

CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o: CMakeFiles/ellens-alien-game.dir/flags.make
CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o: /Users/sallyride/Exercism/cpp/ellens-alien-game/ellens_alien_game_test.cpp
CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o: CMakeFiles/ellens-alien-game.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=/Users/sallyride/Exercism/cpp/ellens-alien-game/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o -MF CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o.d -o CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o -c /Users/sallyride/Exercism/cpp/ellens-alien-game/ellens_alien_game_test.cpp

CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/sallyride/Exercism/cpp/ellens-alien-game/ellens_alien_game_test.cpp > CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.i

CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/sallyride/Exercism/cpp/ellens-alien-game/ellens_alien_game_test.cpp -o CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.s

CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o: CMakeFiles/ellens-alien-game.dir/flags.make
CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o: /Users/sallyride/Exercism/cpp/ellens-alien-game/test/tests-main.cpp
CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o: CMakeFiles/ellens-alien-game.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=/Users/sallyride/Exercism/cpp/ellens-alien-game/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o -MF CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o.d -o CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o -c /Users/sallyride/Exercism/cpp/ellens-alien-game/test/tests-main.cpp

CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/sallyride/Exercism/cpp/ellens-alien-game/test/tests-main.cpp > CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.i

CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/sallyride/Exercism/cpp/ellens-alien-game/test/tests-main.cpp -o CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.s

# Object files for target ellens-alien-game
ellens__alien__game_OBJECTS = \
"CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o" \
"CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o"

# External object files for target ellens-alien-game
ellens__alien__game_EXTERNAL_OBJECTS =

ellens-alien-game: CMakeFiles/ellens-alien-game.dir/ellens_alien_game_test.cpp.o
ellens-alien-game: CMakeFiles/ellens-alien-game.dir/test/tests-main.cpp.o
ellens-alien-game: CMakeFiles/ellens-alien-game.dir/build.make
ellens-alien-game: CMakeFiles/ellens-alien-game.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --bold --progress-dir=/Users/sallyride/Exercism/cpp/ellens-alien-game/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable ellens-alien-game"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/ellens-alien-game.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/ellens-alien-game.dir/build: ellens-alien-game
.PHONY : CMakeFiles/ellens-alien-game.dir/build

CMakeFiles/ellens-alien-game.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/ellens-alien-game.dir/cmake_clean.cmake
.PHONY : CMakeFiles/ellens-alien-game.dir/clean

CMakeFiles/ellens-alien-game.dir/depend:
	cd /Users/sallyride/Exercism/cpp/ellens-alien-game/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sallyride/Exercism/cpp/ellens-alien-game /Users/sallyride/Exercism/cpp/ellens-alien-game /Users/sallyride/Exercism/cpp/ellens-alien-game/build /Users/sallyride/Exercism/cpp/ellens-alien-game/build /Users/sallyride/Exercism/cpp/ellens-alien-game/build/CMakeFiles/ellens-alien-game.dir/DependInfo.cmake "--color=$(COLOR)"
.PHONY : CMakeFiles/ellens-alien-game.dir/depend

