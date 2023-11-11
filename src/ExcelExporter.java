class ExcelExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "excel --> " + content;
    }
}
