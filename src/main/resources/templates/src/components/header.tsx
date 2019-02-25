import * as React from 'react'
import {CSSProperties} from 'react'
import {boxShadow} from './post-item'

export class Header extends React.Component {

  private spanStyle: CSSProperties = {
    display: 'inline-block',
    lineHeight: '70px',
    marginLeft: '10%',
    fontSize: 'xx-large'
  }

  private headerStyle: CSSProperties = {
    backgroundColor: '#12424d',
    color: '#3ea7b7',
    height: 70,
    position: 'fixed',
    top: '0px',
    width: '100%',
    boxShadow
  }
  render () {
    return <div style={this.headerStyle}>
      <span style={this.spanStyle}>TEST<span style={{ color: 'white' }}>doc</span>avenue</span>
    </div>
  }
}
