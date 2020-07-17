
<%@page import="ws.UserAdvDetails" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <br/>
        <h1>Transaction History</h1>
        <form>
            <table border="1">
                <tr>
                    <th>OrderId</th>
                    <th>AdvId</th>
                    <th>AdvTitle</th>
                    <th>UserId</th>
                    <th>SellId</th>
                    <th>SellAccount</th>
                    <th>AgentId</th>
                    <th>AgentAccount</th>
                    <th>Subtotal</th>
                    <th>DateUp</th>
                    <th>ExpDate</th>
                    <th>OneMonth</th>
                    <th>ThreeMonth</th>
                     <th>SixMonth</th>
                </tr>
                <%
                   List<UserAdvDetails> list=(List<UserAdvDetails>)request.getAttribute("list");
                   for(UserAdvDetails s:list){
                %>
                <tr>
                    <td><%=s.getOrderId()%></td>
                    <td><%=s.getAdvId()%></td>
                    <td><%=s.getAdvTitle()%></td>
                    <td><%=s.getUserId()%></td>
                    <td><%=s.getSeLLId()%></td>
                    <td><%=s.getSeLLAccount()%></td>
                    <td><%=s.getAgentId()%></td>
                    <td><%=s.getAgentAccount()%></td>
                    <td><%=s.getSubTotal()%></td>
                    <td><%=s.getDateUp()%></td>
                    <td><%=s.getExpDate()%></td>
                    <td><%=s.getOnemonth()%></td>
                    <td><%=s.getThreemonths()%></td>
                    <td><%=s.getSixmonths()%></td>
                    
                </tr>
                <%
                   }
                %>
            </table>
        </form>
    </body>
</html>
