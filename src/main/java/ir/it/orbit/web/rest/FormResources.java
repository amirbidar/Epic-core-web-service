package ir.it.orbit.web.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import ir.it.orbit.service.FormService;
import ir.it.orbit.service.dto.Base.FormDTO;
import ir.it.orbit.service.dto.XMLRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FormResources {
    private final Logger log = LoggerFactory.getLogger(FormResources.class);

    private static final String ENTITY_NAME = "epicForm";

    private final FormService formService;

    public FormResources(FormService formService) {
        this.formService = formService;
    }
/*
    @GetMapping("/books/{xml}")
    public ResponseEntity<BookDTO> getBook(@PathVariable String xml) {
        log.debug("REST request to get Book : {}", xml);
        Optional<BookDTO> bookDTO = formService.findAll(id);
        return ResponseUtil.wrapOrNotFound(bookDTO);
    }*/
    @GetMapping("/test")
    public ResponseEntity<FormDTO> getBook() throws JsonProcessingException {
        FormDTO formDTO= formService.findAll(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                        "\t   \t\t\tname=\"FacilityProfitForm\"\n" +
                        "\t   \t\t\tclient-side-language=\"skippy\"\n" +
                        "\t   \t\t\ttitle=\"FacilityProfitForm\" \t   \t\t\t\n" +
                        "\t   \t\t\tvisible=\"false\" \t   \t\t\tlayoutable=\"true\" \t   \t\t\tenabled=\"true\" \t   \t\t\trendered=\"true\" \t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\tresizable=\"false\" \t   \t\t\tdraggable=\"true\" \t   \t\t\t\n" +
                        "\t   \t\t\tversion=\"0\" \n" +
                        "\t   \t\t\t><resources><glossary name=\"TejaratBank-V2\"/></resources><layout><grid-layout \n" +
                        "\t   \t\tnumber-of-columns=\"1\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"0\" vertical-spacing=\"0\"\n" +
                        "\t   \t\t/></layout><children><composite\n" +
                        "\t\t\n" +
                        " name= \"CMP_facilityProfit\" \t\t enabled= \"true\" \t\t\t\n" +
                        "\t\t><layout><grid-layout \n" +
                        "\t   \t\tnumber-of-columns=\"4\" margin-width=\"5\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                        "\t   \t\t/></layout><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"fill\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><children><label \n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        " name= \"LBL_facilityProfitSubject\" \t\t enabled= \"true\" \t\t label= \"Lable.facilityProfitSubject\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"end\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data></label><textfield\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\treadonly= \"false\" \t\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\tmax-length= \"20\" \t\t\t\n" +
                        "\t\t\n" +
                        "\t\tdirection= \"rtl\" \t\t\t\n" +
                        "\t\tformatNumber= \"false\"\n" +
                        "\t\t\n" +
                        " name= \"TXT_facilityProfitSubject\" \t\t enabled= \"true\" \t\t label= \"TextField.facilityProfitSubject\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"begin\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><validators></validators><events></events></textfield><label \n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        " name= \"LBL_facilityProfitPercent\" \t\t enabled= \"true\" \t\t label= \"Lable.facilityProfitPercent\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"end\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data></label><textfield\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\treadonly= \"false\" \t\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\tmax-length= \"20\" \t\t\t\n" +
                        "\t\t\n" +
                        "\t\tdirection= \"rtl\" \t\t\t\n" +
                        "\t\tformatNumber= \"false\"\n" +
                        "\t\t\n" +
                        " name= \"TXT_facilityProfitPercent\" \t\t enabled= \"true\" \t\t label= \"TextField.facilityProfitPercent\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"begin\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><validators></validators><events></events></textfield><label \n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        " name= \"LBL_facilityProfitComment\" \t\t enabled= \"true\" \t\t label= \"Lable.facilityProfitComment\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"end\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data></label><textfield\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\treadonly= \"false\" \t\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\n" +
                        "\t\t\tmax-length= \"20\" \t\t\t\n" +
                        "\t\t\n" +
                        "\t\tdirection= \"rtl\" \t\t\t\n" +
                        "\t\tformatNumber= \"false\"\n" +
                        "\t\t\n" +
                        " name= \"TXT_facilityProfitComment\" \t\t enabled= \"true\" \t\t label= \"TextField.facilityProfitComment\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"begin\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><validators></validators><events></events></textfield></children></composite><composite\n" +
                        "\t\t\n" +
                        " name= \"CMP_facilityProfitExportOrRefuse\" \t\t enabled= \"true\" \t\t\t\n" +
                        "\t\t><layout><grid-layout \n" +
                        "\t   \t\tnumber-of-columns=\"4\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"5\" vertical-spacing=\"0\"\n" +
                        "\t   \t\t/></layout><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"false\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"fill\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><children><button\n" +
                        "\t\t action= \"none\"  \n" +
                        "\t\t\n" +
                        "\t\t caption= \"Button.facilityProfitFinalExport\" \n" +
                        "\t\t\n" +
                        "\t\t icon-width= \"0\"\n" +
                        "\t\t icon-height= \"0\"\n" +
                        "\t\t\n" +
                        " name= \"BTN_Button.facilityProfitFinalExport\" \t\t enabled= \"true\" \t\t label= \"Button.facilityProfitFinalExport\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"2\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"true\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"end\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><events></events></button><button\n" +
                        "\t\t action= \"close\"  \n" +
                        "\t\t\n" +
                        "\t\t caption= \"Button.facilityProfitFinalRefus\" \n" +
                        "\t\t\n" +
                        "\t\t icon-width= \"0\"\n" +
                        "\t\t icon-height= \"0\"\n" +
                        "\t\t\n" +
                        " name= \"BTN_facilityProfitFinalRefus\" \t\t enabled= \"true\" \t\t label= \"Button.facilityProfitFinalRefus\" \t\n" +
                        "\t\t><layout-data><grid-layout-data\n" +
                        "\t\t\t\n" +
                        "\t\t\t\trow-span=\"1\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tcol-span=\"2\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-grab=\"false\" \n" +
                        "\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-grab=\"true\" \n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\tv-alignment=\"center\" \n" +
                        "\t\t\t\n" +
                        "\t\t\t\n" +
                        "\t\t\th-alignment=\"begin\"\n" +
                        "\t\t\t \n" +
                        "\t\t\t\n" +
                        "\t\t\t \n" +
                        "\t\t\t/></layout-data><events></events></button></children></composite></children></form>\n" +
                        "\t   \t"
        );
        return  ResponseEntity.ok()
                .body(formDTO);
    }
 @GetMapping("/test2")
    public XMLRequestDTO GetXml() throws JsonProcessingException {
XMLRequestDTO xmlRequestDTO= new XMLRequestDTO();
xmlRequestDTO.setData("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
        "\t   \t\t\t<form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\"\n" +
        "\t\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
        "\t   \t\t\tname=\"TestForm2\"\n" +
        "\t   \t\t\tclient-side-language=\"skippy\"\n" +
        "\t   \t\t\ttitle=\"TestForm2\" \t   \t\t\t\n" +
        "\t   \t\t\tvisible=\"false\" \t   \t\t\tlayoutable=\"true\" \t   \t\t\tenabled=\"true\" \t   \t\t\trendered=\"true\" \t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\tresizable=\"false\" \t   \t\t\tdraggable=\"true\" \t   \t\t\t\n" +
        "\t   \t\t\tversion=\"1\" \n" +
        "\t   \t\t\t>\n" +
        "\n" +
        "\t\t\t\t<resources>\n" +
        "\t\t\t\t\t<glossary name=\"MyReports\"/>\n" +
        "\t\t\t\t</resources>\n" +
        "\n" +
        "\t\t\t\t\n" +
        "\t\t\t\t\n" +
        "\t\t\t\t\n" +
        "\t\t\t\t\n" +
        "\t\t\t\t\n" +
        "\n" +
        "\t\t\t\t\n" +
        "\n" +
        "\t\t\t\t\n" +
        "\n" +
        "\t\t\t\t\n" +
        "\t<layout>\n" +
        "\t   \t\t<grid-layout \n" +
        "\t   \t\tnumber-of-columns=\"1\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"0\" vertical-spacing=\"0\"\n" +
        "\t   \t\t/>\n" +
        "\t</layout>\n" +
        "\n" +
        "\t\t\t\t\t\n" +
        "\t\t\t\t\n" +
        "\t\t\t\t<children>\n" +
        "\t\t\t  \t\n" +
        "\t\t\t\t\t\n" +
        "\t\n" +
        "\n" +
        "\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\t<label \n" +
        "\t\t\n" +
        "\t\t\ttooltip= \"thisistooltip\" \t\t\t\n" +
        "\t\t\n" +
        "\t\t\n" +
        "\t\t\tvalue= \"thisisvalue\" \t\t\t\n" +
        "\t\t\n" +
        "\t\t\n" +
        " name= \"Label3537\" \t\t enabled= \"true\" \t\t label= \"label\" \t layoutable= \"true\" \n" +
        "\t\t>\n" +
        "\t\t\n" +
        "\t<layout-data>\n" +
        "\t\t<grid-layout-data\n" +
        "\t\t\t\n" +
        "\t\t\t\trow-span=\"16\" \n" +
        "\t\t\t\n" +
        "\t\t\t\n" +
        "\t\t\tcol-span=\"15\" \n" +
        "\t\t\t\n" +
        "\t\t\t\n" +
        "\t\t\tv-grab=\"true\" \n" +
        "\t\t\t\t\n" +
        "\t\t\t\n" +
        "\t\t\th-grab=\"true\" \n" +
        "\t\t\t\t\t\n" +
        "\t\t\t\n" +
        "\t\t\tv-alignment=\"fill\" \n" +
        "\t\t\t\n" +
        "\t\t\t\n" +
        "\t\t\th-alignment=\"begin\"\n" +
        "\t\t\t \n" +
        "\t\t\t\n" +
        "\t\t\t \n" +
        "\t\t\t/>\n" +
        "\t</layout-data>\n" +
        "\n" +
        "\t\t\n" +
        "\t\t\n" +
        "\t   \t\t<events>\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t <on-focus-lost\n" +
        "\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\tphase=\"before_update_model\"\n" +
        "\t\n" +
        "\tcondition=\"condition\" \n" +
        "\tclient-side-language= \"javascript\"\n" +
        "\taction=\"#{asdasdasdasd}\"\n" +
        "\t  submit-region=\"region\"\n" +
        "\tname=\"event_3538\" \n" +
        "\tre-render=\"renderer\" \n" +
        "\tfire-condition=\"fire\" \n" +
        "\tbefore=\"before\" \n" +
        "\ton-success=\"success\" \n" +
        "\trun-at= \"client\"\n" +
        "\t>\n" +
        "\n" +
        "\t\n" +
        "\t\n" +
        "\t\t<argument name=\"amir\" value=\"1\"/>\n" +
        "\t\n" +
        "\t\t<argument name=\"bidar\" value=\"2\"/>\n" +
        "\t\n" +
        "\t\t<argument name=\"sepahi\" value=\"13\"/>\n" +
        "\t\n" +
        "\t\n" +
        "\t </on-focus-lost>\n" +
        "\t\n" +
        "\t \n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t <on-load\n" +
        "\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\tphase=\"after_update_model\"\n" +
        "\t\n" +
        "\tcondition=\"condition\" \n" +
        "\tclient-side-language= \"inherit\"\n" +
        "\taction=\"#{asdasdasdasdasda}\"\n" +
        "\t  submit-region=\"region\"\n" +
        "\tname=\"event_3539\" \n" +
        "\tre-render=\"renderer\" \n" +
        "\tfire-condition=\"fire\" \n" +
        "\tbefore=\"before\" \n" +
        "\ton-success=\"success\" \n" +
        "\trun-at= \"server\"\n" +
        "\t>\n" +
        "\n" +
        "\t\n" +
        "\t\n" +
        "\t\t<argument name=\"amir\" value=\"bidar\"/>\n" +
        "\t\n" +
        "\t\t<argument name=\"amir\" value=\"sepahi\"/>\n" +
        "\t\n" +
        "\t\t<argument name=\"mahdi\" value=\"faramarzi\"/>\n" +
        "\t\n" +
        "\t\n" +
        "\t </on-load>\n" +
        "\t\n" +
        "\t \n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t</events>\n" +
        "   \t\t\n" +
        "\n" +
        "\t\t\n" +
        "   \t\t\t<listeners>\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t\t<phase-listener\n" +
        "\t\tphase=\"before_update_model\"\n" +
        "\t\taction=\"#{}\"\n" +
        "\t\t/>\n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t\t<phase-listener\n" +
        "\t\tphase=\"before_update_model\"\n" +
        "\t\taction=\"#{}\"\n" +
        "\t\t/>\n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t\t<phase-listener\n" +
        "\t\tphase=\"after_update_model\"\n" +
        "\t\taction=\"#{}\"\n" +
        "\t\t/>\n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t\t<phase-listener\n" +
        "\t\tphase=\"before_first_render\"\n" +
        "\t\taction=\"#{}\"\n" +
        "\t\t/>\n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t\t\n" +
        "\t\n" +
        "\t\t<phase-listener\n" +
        "\t\tphase=\"before_render\"\n" +
        "\t\taction=\"qweqewq\"\n" +
        "\t\tcondition=\"condition\" \t\t/>\n" +
        "\n" +
        "   \t\t\t\n" +
        "   \t\t\t</listeners>\n" +
        "   \t\t\n" +
        "\t\t\n" +
        "\t\t</label>\n" +
        "\t\t\n" +
        "\t\t\n" +
        "\t\t\n" +
        "\n" +
        "\t\t\n" +
        "\n" +
        "\t\t\n" +
        "\n" +
        "\t\n" +
        "\t\t\t\t  \t\t\t\n" +
        "\t\t\t\t  \t\t\t\n" +
        "\n" +
        "\n" +
        "\t\t\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\t\n" +
        "\t\n" +
        "\t\t\t  \t\t\t\n" +
        "\t\n" +
        "\n" +
        "\t\t\t\t  \t\t\t\n" +
        "\n" +
        "\n" +
        "\t\t\t\t  \t\t\t\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\t \n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\t \n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\t\n" +
        "\t\n" +
        "\t\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\n" +
        "\t\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\t\t\n" +
        "\n" +
        "\n" +
        "\n" +
        "\t\t\t\t\n" +
        "\n" +
        "\t\t\t   \t\n" +
        "\t\t\t   \t\n" +
        "\t\t\t   \t</children>\n" +
        "\t\t\t\t\n" +
        "\n" +
        "\t\t\t   \t</form>\n" +
        "\t   \t");
return xmlRequestDTO;
    }

    @PostMapping("/GET")
    public ResponseEntity<FormDTO> GetXmlToJson(@RequestBody XMLRequestDTO xmlRequestDTO) throws JsonProcessingException {
        FormDTO formDTO= formService.findAll(
                xmlRequestDTO.getData());
        return  ResponseEntity.ok()
                .body(formDTO);
    }









}
