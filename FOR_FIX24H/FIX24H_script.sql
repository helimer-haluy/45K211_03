USE [pro1]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 4/29/2022 2:51:20 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fname] [nvarchar](255) NULL,
	[username] [nvarchar](255) NOT NULL,
	[password] [nvarchar](255) NOT NULL,
	[email] [nvarchar](255) NULL,
	[phonenumber] [nvarchar](50) NULL,
	[isCustomer] [bit] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EmpAccount]    Script Date: 4/29/2022 2:51:20 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[EmpAccount](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fname] [nvarchar](255) NULL,
	[username] [nvarchar](255) NOT NULL,
	[email] [nvarchar](255) NOT NULL,
	[phonenumber] [nvarchar](255) NULL,
	[password] [nvarchar](50) NULL,
	[district] [nvarchar](255) NULL,
	[city] [nvarchar](255) NULL,
	[icard] [nvarchar](255) NULL,
	[license] [nvarchar](255) NULL
) ON [PRIMARY]
GO
