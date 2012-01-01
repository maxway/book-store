package org.apache.jsp.tag.web.embed;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class video_tagx
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String id;
  private java.lang.Boolean render;
  private java.lang.String videoId;
  private java.lang.String provider;
  private java.lang.String z;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
    jspContext.setAttribute("id", id);
  }

  public java.lang.Boolean getRender() {
    return this.render;
  }

  public void setRender(java.lang.Boolean render) {
    this.render = render;
    jspContext.setAttribute("render", render);
  }

  public java.lang.String getVideoId() {
    return this.videoId;
  }

  public void setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    jspContext.setAttribute("videoId", videoId);
  }

  public java.lang.String getProvider() {
    return this.provider;
  }

  public void setProvider(java.lang.String provider) {
    this.provider = provider;
    jspContext.setAttribute("provider", provider);
  }

  public java.lang.String getZ() {
    return this.z;
  }

  public void setZ(java.lang.String z) {
    this.z = z;
    jspContext.setAttribute("z", z);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue.release();
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);
    if( getId() != null ) 
      _jspx_page_context.setAttribute("id", getId());
    if( getRender() != null ) 
      _jspx_page_context.setAttribute("render", getRender());
    if( getVideoId() != null ) 
      _jspx_page_context.setAttribute("videoId", getVideoId());
    if( getProvider() != null ) 
      _jspx_page_context.setAttribute("provider", getProvider());
    if( getZ() != null ) 
      _jspx_page_context.setAttribute("z", getZ());

    try {
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fwhen_005f3(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fwhen_005f4(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/embed/video.tagx(12,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${provider eq 'youtube'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_spring_005furl_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("<iframe allowfullscreen=\"true\" frameborder=\"0\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("http://www.youtube.com/embed/${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false) + "\" height=\"320\" width=\"545\" title=\"YouTube video player\"/>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/tags/embed/video.tagx(13,77) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setVar("video");
    // /WEB-INF/tags/embed/video.tagx(13,77) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("http://www.youtube.com/v/${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/embed/video.tagx(17,43) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${provider eq 'vimeo'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_spring_005furl_005f1(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("<object height=\"320\" width=\"545\">");
        out.write("<param value=\"true\" name=\"allowfullscreen\"/>");
        out.write("<param value=\"always\" name=\"allowscriptaccess\"/>");
        out.write("<param value=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(video)}", java.lang.String.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false) + "\" name=\"movie\"/>");
        out.write("<embed height=\"320\" width=\"545\" allowscriptaccess=\"always\" allowfullscreen=\"true\" type=\"application/x-shockwave-flash\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(video)}", java.lang.String.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false) + "\"/>");
        out.write("</object>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/tags/embed/video.tagx(18,70) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setVar("video");
    // /WEB-INF/tags/embed/video.tagx(18,70) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("http://vimeo.com/moogaloop.swf");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_eval_spring_005furl_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_spring_005fparam_005f0(_jspx_th_spring_005furl_005f1, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f1))
            return true;
          if (_jspx_meth_spring_005fparam_005f1(_jspx_th_spring_005furl_005f1, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f1))
            return true;
          if (_jspx_meth_spring_005fparam_005f2(_jspx_th_spring_005furl_005f1, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f1))
            return true;
          if (_jspx_meth_spring_005fparam_005f3(_jspx_th_spring_005furl_005f1, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f1))
            return true;
          if (_jspx_meth_spring_005fparam_005f4(_jspx_th_spring_005furl_005f1, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f1))
            return true;
          if (_jspx_meth_spring_005fparam_005f5(_jspx_th_spring_005furl_005f1, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f1))
            return true;
          int evalDoAfterBody = _jspx_th_spring_005furl_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f0 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f1);
    // /WEB-INF/tags/embed/video.tagx(19,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/embed/video.tagx(19,59) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f0.setName("clip_id");
    int _jspx_eval_spring_005fparam_005f0 = _jspx_th_spring_005fparam_005f0.doStartTag();
    if (_jspx_th_spring_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f1 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f1);
    // /WEB-INF/tags/embed/video.tagx(20,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f1.setValue("vimeo.com");
    // /WEB-INF/tags/embed/video.tagx(20,57) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f1.setName("server");
    int _jspx_eval_spring_005fparam_005f1 = _jspx_th_spring_005fparam_005f1.doStartTag();
    if (_jspx_th_spring_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f2 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f1);
    // /WEB-INF/tags/embed/video.tagx(21,53) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f2.setValue("1");
    // /WEB-INF/tags/embed/video.tagx(21,53) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f2.setName("show_title");
    int _jspx_eval_spring_005fparam_005f2 = _jspx_th_spring_005fparam_005f2.doStartTag();
    if (_jspx_th_spring_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f3 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f1);
    // /WEB-INF/tags/embed/video.tagx(22,54) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f3.setValue("1");
    // /WEB-INF/tags/embed/video.tagx(22,54) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f3.setName("show_byline");
    int _jspx_eval_spring_005fparam_005f3 = _jspx_th_spring_005fparam_005f3.doStartTag();
    if (_jspx_th_spring_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f4 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f1);
    // /WEB-INF/tags/embed/video.tagx(23,56) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f4.setValue("0");
    // /WEB-INF/tags/embed/video.tagx(23,56) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f4.setName("show_portrait");
    int _jspx_eval_spring_005fparam_005f4 = _jspx_th_spring_005fparam_005f4.doStartTag();
    if (_jspx_th_spring_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f4);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f4);
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f5 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f1);
    // /WEB-INF/tags/embed/video.tagx(24,53) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f5.setValue("1");
    // /WEB-INF/tags/embed/video.tagx(24,53) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f5.setName("fullscreen");
    int _jspx_eval_spring_005fparam_005f5 = _jspx_th_spring_005fparam_005f5.doStartTag();
    if (_jspx_th_spring_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f5);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/embed/video.tagx(34,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${provider eq 'viddler'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_spring_005furl_005f2(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
          return true;
        out.write("<object id=\"viddler\" height=\"320\" width=\"545\" classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\">");
        out.write("<param value=\"\" name=\"movie\"/>");
        out.write("<param value=\"always\" name=\"allowScriptAccess\"/>");
        out.write("<param value=\"true\" name=\"allowFullScreen\"/>");
        out.write("<param value=\"fake=1\" name=\"flashvars\"/>");
        out.write("<embed name=\"viddler\" flashvars=\"fake=1\" allowFullScreen=\"true\" allowScriptAccess=\"always\" type=\"application/x-shockwave-flash\" height=\"320\" width=\"545\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(video)}", java.lang.String.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false) + "\"/>");
        out.write("</object>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /WEB-INF/tags/embed/video.tagx(35,81) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setVar("video");
    // /WEB-INF/tags/embed/video.tagx(35,81) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("http://www.viddler.com/player/${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/embed/video.tagx(45,50) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${provider eq 'google_video'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
    if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_spring_005furl_005f3(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
          return true;
        out.write("<embed type=\"application/x-shockwave-flash\" allowScriptAccess=\"always\" allowFullScreen=\"true\" style=\"width:545px;height:400px\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(video)}", java.lang.String.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false) + "\" id=\"VideoPlayback\"/>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /WEB-INF/tags/embed/video.tagx(46,80) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setValue("http://video.google.com/googleplayer.swf");
    // /WEB-INF/tags/embed/video.tagx(46,80) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setVar("video");
    int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
      if (_jspx_eval_spring_005furl_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_spring_005fparam_005f6(_jspx_th_spring_005furl_005f3, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f3))
            return true;
          if (_jspx_meth_spring_005fparam_005f7(_jspx_th_spring_005furl_005f3, _jspx_page_context, _jspx_push_body_count_spring_005furl_005f3))
            return true;
          int evalDoAfterBody = _jspx_th_spring_005furl_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_spring_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f3)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f6 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f3);
    // /WEB-INF/tags/embed/video.tagx(47,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/embed/video.tagx(47,57) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f6.setName("docid");
    int _jspx_eval_spring_005fparam_005f6 = _jspx_th_spring_005fparam_005f6.doStartTag();
    if (_jspx_th_spring_005fparam_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f6);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f6);
    return false;
  }

  private boolean _jspx_meth_spring_005fparam_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005furl_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005furl_005f3)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_005fparam_005f7 = (org.springframework.web.servlet.tags.ParamTag) _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_005fparam_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fparam_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005furl_005f3);
    // /WEB-INF/tags/embed/video.tagx(48,48) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f7.setValue("true");
    // /WEB-INF/tags/embed/video.tagx(48,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fparam_005f7.setName("fs");
    int _jspx_eval_spring_005fparam_005f7 = _jspx_th_spring_005fparam_005f7.doStartTag();
    if (_jspx_th_spring_005fparam_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f7);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fspring_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_spring_005fparam_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/embed/video.tagx(54,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${provider eq 'screenr'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
    if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<object codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,115,0\" classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" height=\"340\" width=\"545\">");
        out.write("<param value=\"http://screenr.com/Content/assets/screenr_1116090935.swf\" name=\"movie\"/>");
        out.write("<param value=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false) + "\" name=\"flashvars\"/>");
        out.write("<param value=\"true\" name=\"allowFullScreen\"/>");
        out.write("<embed pluginspage=\"http://www.macromedia.com/go/getflashplayer\" height=\"340\" width=\"545\" allowFullScreen=\"true\" flashvars=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${videoId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false) + "\" src=\"http://screenr.com/Content/assets/screenr_1116090935.swf\"/>");
        out.write("</object>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
    return false;
  }
}
