<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jarkata.tags.core" %>
<a href = "/admin/categories/add">Add Category</a>
<table>
	<tr>
		<th>STT</th>
		<th>Images</th>
		<th>Categoryname</th>
		<th>Status</th>
		<th>Action</th>
	</tr>
	<c:forEach items="${list}" var="cate" varStatus="stt">
		<tr>
			<th>${stt.index + 1}</th>
			<th>${cate.images}</th>
			<th>${cate.name}</th>
			<th>${status}</th>
			<th>
				<a href = "/admin/categories/edit/${cate.id}">Sửa</a>
				<a href = "/admin/categories/delete/${cate.id}">Sửa</a>
			</th>
		</tr>
	</c:forEach>

</table>