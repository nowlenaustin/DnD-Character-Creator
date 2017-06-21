import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.IOException;

import java.util.Map;
 
public class formFieldEditor {
 
    public void manipulatePdf(String src, String dest, Map<String, String> formFieldsToChange) throws IOException {
        PdfReader reader = new PdfReader(src);
        PdfDocument pdf = new PdfDocument(reader, new PdfWriter(dest));
        PdfAcroForm form = PdfAcroForm.getAcroForm(pdf, true);
        
        for(Map.Entry<String, String> entry : formFieldsToChange.entrySet()){
            PdfFormField tf = form.getFormFields().get(entry.getKey());
            tf.setValue(entry.getValue());
        }

//
//        Uncomment to view all the field names
//
//        Map<String,PdfFormField> ff = form.getFormFields();
//        for(Map.Entry<String,PdfFormField> entry : ff.entrySet()){
//        	System.out.println("\"" + entry.getKey() +"\"");
//        }

        pdf.close();
    }
}