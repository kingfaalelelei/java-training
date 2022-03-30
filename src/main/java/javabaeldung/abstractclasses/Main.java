package javabaeldung.abstractclasses;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws URISyntaxException {
//    URL location = Main.class.getClassLoader().getResource("files/test.txt")
    Path path = Paths.get("");
    BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);

//    assertThat(lowercaseFileReader.readFile()).isInstanceOf(List.class);
  }
}
