# Simple Toast

#Demo Vodeo



https://user-images.githubusercontent.com/122840712/218659040-e86c2d0e-4eef-47ce-9ccd-14d55bb1959f.mp4





Step 1. Add the JitPack repository to your build file


    allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.technicalamanpandit:first_library:1.7'
	}
  
  Step 3. code
   
    First_library.Toasty(context, "Enter your toast message");
  
  
