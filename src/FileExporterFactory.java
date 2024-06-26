public class FileExporterFactory {
    public static FileExporter getInstance(FileType fileType){
        switch (fileType){
            case PDF -> {
                return new PdfExporter();
            }
            case EXCEL -> {
                return new ExcelExporter();
            }
            //case dışında kalanları desteklemiyoruz
            default -> throw new UnsupportedOperationException();
        }
    }

    public enum FileType{
        PDF,
        EXCEL;
    }
}
