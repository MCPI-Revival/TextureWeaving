# TextureWeaving
Simple Java Tool To Convert Minecraft: Pi Edition's Texture Atlases (``terrain.png``, etc) Into Separate Files (``block/stone.png``, etc) And Vice Versa

## Install

### Prerequsites
- Java
```
git clone https://github.com/MCPI-Revival/TextureWeaving/
cd TextureWeaving
```
Now, depending on if you are on Windows or Linux, run the following commands:
### Linux
```
./gradlew build
```
### Windows (in command prompt)
```
gradlew.bat build
```

## Usage
```
TextureWeaving <stitch|cut> <input> <output>
```

### Example
```she
java -jar TextureWeaving-1.0-SNAPSHOT.jar cut ~/Documents/mcpi/data/images out
java -jar TextureWeaving-1.0-SNAPSHOT.jar stitch out ~/Documents/mcpi/data/images
```
