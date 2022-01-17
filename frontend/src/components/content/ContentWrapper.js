import React from "react";

class ContentWrapper extends React.Component {

    render() {
        return (
            <div className="content-wrapper">{this.props.content}</div>
        );
    }

}

export default ContentWrapper;