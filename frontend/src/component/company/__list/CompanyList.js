import {Component} from "react";

import "./CompanyList.css";

class CompanyList extends Component {

    render() {
        return (
            <ul className={this.props.className}>
                {this.props.content}
            </ul>
        )
    }

}

export default CompanyList;