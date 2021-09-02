class Book {
    public int pages;
    public String name;
    public String Autor;

    public void info(){
        System.out.println("В книге " + name + " находиться " + pages + " страниц. ");
        System.out.print("Написал эту книгу " + Autor);
    }
}
