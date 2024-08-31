<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<section id="content">
	<form id="devFrm" action="" method="post">
			<div class="form-group row">
				<label for="studentId" class="col-sm-2 col-form-label">아이디</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" 
					id="studentId" name="studentId" value="${student.studentId}">
				</div>
			</div>
			<div class="form-group row">
			<label for="studentPwd" class="col-sm-2 col-form-label">password</label>
			<div class="col-sm-10">
				<input type="password" 
				class="form-control" id="studentPwd" name="studentPwd"
				required value="${student.studentPwd}">			
			</div>
			</div>
			<div class="form-group row">
				<label for="studentName" class="col-sm-2 col-form-label">이름</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" 
					id="studentName" name="studentName"
					value="${student.studentName}">
				</div>
			</div>
			<div class="form-group row">
				<label for="studentGrade" class="col-sm-2 col-form-label">학년</label>
				<div class="col-sm-10">
					<input type="number" class="form-control" 
					id="studentGrade" name="studentGrade"
					value="${student.studentGrade}">
				</div>
			</div>
			<div class="form-group row">
				<label for="schoolName" class="col-sm-2 col-form-label">학교명</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" 
					id="schoolName" name="schoolName"
					value=" ${student.schoolName}">
				</div>
			</div>
			<div class="form-group row">
				<label for="studentNickname" class="col-sm-2 col-form-label">별명</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" 
					id="studentNickname" name="studentNickname"
					value="${student.studentNickname}">
				</div>
			</div>
				<div class="form-group row">
					<div class="col-sm-12">
						<button type="submit" 
						class="btn btn-outline-info col-sm-12" 
						>
						회원정보 수정</button>
					</div>
					<div class="col-sm-12">
						<button type="button" 
						class="btn btn-outline-info col-sm-12" 
						>
						회원정보 탈퇴</button>
					</div>
				</div>
		</form>

</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>