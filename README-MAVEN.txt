README    README    README    README    README    README    README    README    README    README


  _|_|_|                      _|            _|_|_|_|  _|      _|
_|          _|_|_|    _|_|_|  _|    _|_|_|  _|          _|  _|
  _|_|    _|        _|    _|  _|  _|    _|  _|_|_|        _|
      _|  _|        _|    _|  _|  _|    _|  _|          _|  _|
_|_|_|      _|_|_|    _|_|_|  _|    _|_|_|  _|        _|      _|


This is the file `README-MAVEN.txt'.

The official build systems for ScalaFX is SBT. Building with Maven is not 
supported but may be possible :).

This document describes how the developers support the Maven repository system.

This project build relies on SBT, but you can get the scalafx libraries like this in
your local repository:

# execute this commands on the command line
sbt clean compile package make-pom package-src make-pom

# if you work with scala 2.10 (at your own risk)
mvn install:install-file -DartifactId=scalafx_2.10 \
    -DgroupId=org.scalafx \
    -Dpackaging=jar \
    -DpomFile=scalafx/target/scala-2.10/scalafx_2.10-1.0-SNAPSHOT.pom \
    -Dfile=scalafx/target/scala-2.10/scalafx_2.10-1.0-SNAPSHOT.jar \
    -Dversion=1.0-SNAPSHOT \
    -Dsources=scalafx/target/scala-2.10/scalafx_2.10-1.0-SNAPSHOT-sources.jar

# or, if you work with scala 2.9.3 (officially supported)
mvn install:install-file -DartifactId=scalafx_2.9.3 \
    -DgroupId=org.scalafx \
    -Dpackaging=jar \
    -DpomFile=scalafx/target/scala-2.9.3/scalafx_2.9.3-1.0-SNAPSHOT.pom \
    -Dfile=scalafx/target/scala-2.9.3/scalafx_2.9.3-1.0-SNAPSHOT.jar \
    -Dversion=1.0-SNAPSHOT \
    -Dsources=scalafx/target/scala-2.9.3/scalafx_2.9.3-1.0-SNAPSHOT-sources.jar

You can change the scala version in project/build.scala, search for scalaversion variable.

You'll want to reference the artifacts like this:

for scala 2.9.3:

		<dependency>
			<groupId>org.scalafx</groupId>
			<artifactId>scalafx_2.9.3</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>

and for scala 2.10:

		<dependency>
			<groupId>org.scalafx</groupId>
			<artifactId>scalafx_2.10</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>

# generate eclipse project files via

sbt eclipse

happy coding!
