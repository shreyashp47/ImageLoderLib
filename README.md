# Android Project: Image Loading Libraries Comparison

## Overview
This Android project demonstrates the implementation and comparison of three popular image loading libraries:

- **Glide**
- **Fresco**
- **Picasso**

The project showcases how each library handles image loading, caching, and performance.

## Features
- **Glide**: Efficient image loading and caching, supports animated GIFs.
- **Fresco**: Handles image loading with DraweeView and Bitmap memory management.
- **Picasso**: Simple and easy-to-use API for image loading.
- Side-by-side comparison of performance and features.

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```
2. Open the project in Android Studio.
3. Sync the Gradle files.

## Libraries Used
### Glide
- Add the dependency to `build.gradle`:
  ```groovy
  implementation 'com.github.bumptech.glide:glide:4.15.1'
  annotationProcessor 'com.github.bumptech.glide:compiler:4.15.1'
  ```
- Official Documentation: [Glide](https://bumptech.github.io/glide/)

### Fresco
- Add the dependency to `build.gradle`:
  ```groovy
  implementation 'com.facebook.fresco:fresco:2.6.0'
  ```
- Official Documentation: [Fresco](https://frescolib.org/)

### Picasso
- Add the dependency to `build.gradle`:
  ```groovy
  implementation 'com.squareup.picasso:picasso:2.8'
  ```
- Official Documentation: [Picasso](https://square.github.io/picasso/)

## Usage
### Glide Example
```java
Glide.with(context)
     .load(imageUrl)
     .into(imageView);
```

### Fresco Example
```java
Uri uri = Uri.parse(imageUrl);
simpleDraweeView.setImageURI(uri);
```

### Picasso Example
```java
Picasso.get()
       .load(imageUrl)
       .into(imageView);
```

## Comparison
| Feature                | Glide            | Fresco           | Picasso          |
|------------------------|------------------|------------------|------------------|
| Memory Management     | Excellent        | Best             | Good             |
| Animated GIF Support  | Yes              | Yes              | No               |
| Ease of Use           | Moderate         | Complex          | Easy             |
| Performance           | High             | High             | Moderate         |
| Customization         | High             | High             | Moderate         |

## Screenshots 


## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contribution
Feel free to fork the repository and submit a pull request for improvements or additional features.

