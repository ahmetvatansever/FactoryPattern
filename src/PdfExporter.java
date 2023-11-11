class PdfExporter implements FileExporter {

    @Override
    public String export(String content) {
        return "pdf --> " + content;
    }
}
