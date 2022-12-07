import java.util.ArrayList;

public class Directory {
    String name;
    Directory parent;
    ArrayList<Directory> children = new ArrayList<>();
    ArrayList<File> files = new ArrayList<>();
    int size;

    public Directory(String name, Directory parent){
        this.name = name;
        this.parent = parent;
    }

    public void addChildDirectory(String name){
       Directory x = new Directory(name, this);
       this.children.add(x);
    }

    public void addFile(File file){
        this.files.add(file);
        this.size += file.size;
    }
}
