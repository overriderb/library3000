<%@ page import="" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.library.controller.LibraryController" %>

<html>
<body>
<jsp:useBean id="link" scope="application" class = "com.library.controller.LibraryController" />
<% LibraryController libraryController = new LibraryController();
//    libraryController.addLibrary()
%>

<%--
<form:form method="post" action="add" commandName="contact">

    <table>
        <tr>
            <td><form:label path="firstname">
                <spring:message code="label.firstname" />
            </form:label></td>
            <td><form:input path="firstname" /></td>
        </tr>
        <tr>
            <td><form:label path="lastname">
                <spring:message code="label.lastname" />
            </form:label></td>
            <td><form:input path="lastname" /></td>
        </tr>
        <tr>
            <td><form:label path="email">
                <spring:message code="label.email" />
            </form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="telephone">
                <spring:message code="label.telephone" />
            </form:label></td>
            <td><form:input path="telephone" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"
                                   value="<spring:message code='label.addcontact'/>" /></td>
        </tr>
    </table>
</form:form>
--%>

<h2>Hello World!</h2>
</body>
</html>
