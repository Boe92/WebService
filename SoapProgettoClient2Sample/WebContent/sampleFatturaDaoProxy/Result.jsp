<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFatturaDaoProxyid" scope="session" class="com.alfasoft.dao.FatturaDaoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFatturaDaoProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleFatturaDaoProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleFatturaDaoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.alfasoft.dao.FatturaDao getFatturaDao10mtemp = sampleFatturaDaoProxyid.getFatturaDao();
if(getFatturaDao10mtemp == null){
%>
<%=getFatturaDao10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String codice_1id=  request.getParameter("codice24");
            java.lang.String codice_1idTemp = null;
        if(!codice_1id.equals("")){
         codice_1idTemp  = codice_1id;
        }
        com.alfasoft.entita.Fattura getFatturaConCodice15mtemp = sampleFatturaDaoProxyid.getFatturaConCodice(codice_1idTemp);
if(getFatturaConCodice15mtemp == null){
%>
<%=getFatturaConCodice15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">importo:</TD>
<TD>
<%
if(getFatturaConCodice15mtemp != null){
%>
<%=getFatturaConCodice15mtemp.getImporto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ragioneSociale:</TD>
<TD>
<%
if(getFatturaConCodice15mtemp != null){
java.lang.String typeragioneSociale20 = getFatturaConCodice15mtemp.getRagioneSociale();
        String tempResultragioneSociale20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeragioneSociale20));
        %>
        <%= tempResultragioneSociale20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceCliente:</TD>
<TD>
<%
if(getFatturaConCodice15mtemp != null){
java.lang.String typecodiceCliente22 = getFatturaConCodice15mtemp.getCodiceCliente();
        String tempResultcodiceCliente22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceCliente22));
        %>
        <%= tempResultcodiceCliente22 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 26:
        gotMethod = true;
        com.alfasoft.entita.Fattura[] getTutteFatture26mtemp = sampleFatturaDaoProxyid.getTutteFatture();
if(getTutteFatture26mtemp == null){
%>
<%=getTutteFatture26mtemp %>
<%
}else{
        String tempreturnp27 = null;
        if(getTutteFatture26mtemp != null){
        java.util.List listreturnp27= java.util.Arrays.asList(getTutteFatture26mtemp);
        tempreturnp27 = listreturnp27.toString();
        }
        %>
        <%=tempreturnp27%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>