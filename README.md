# java-tutorial

# This repository is strictly for keeping track of personal learning curve.

# Errors encountered/When I encountered them/Why it happened/How to resolve

*java.lang.String cannot be converted to String*
- Encountered this when I tried to compile the file with class name "String"
- A conflict between system class java.lang.String and my class named String
- Resolve by changing name of Class

*failed to compile*
- Failed to build/compile
- *not sure why* Possibly due to renaming folders/class names/packages and not synced properly
- Resolve by clearing workspace cache in VS code. Continue to link if it doesn't fix (https://stackoverflow.com/questions/50454523/how-can-i-fix-build-failed-do-you-want-to-continue-in-vscode)

*reached end of file while parsing*
- Encountered this when I tried to run the program
- Missing a closed "}" 
- Add } where necessary