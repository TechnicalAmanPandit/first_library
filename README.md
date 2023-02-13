# first_library

Step 1. Add the JitPack repository to your build file


    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.technicalamanpandit:first_library:1.7'
	}
  
  Step 3. code
   
    First_library.Toasty(context, "Enter your toast massege");
  
  
